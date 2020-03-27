package br.com.studiotrek.makebrazilemoagain.repository.implementation;

import br.com.studiotrek.makebrazilemoagain.domain.Podcast;
import br.com.studiotrek.makebrazilemoagain.exception.InternalServerError;
import br.com.studiotrek.makebrazilemoagain.exception.NotFoundException;
import br.com.studiotrek.makebrazilemoagain.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PodcastRepositoryImpl implements BaseRepository {

    @Autowired
    private PodcastRepositoryWithMongo repository;

    @Override
    public Podcast findById(String id) {
        try {
            Optional<Podcast> podcast = repository.findById(id);

            if(!podcast.isPresent()) {
                throw new NotFoundException("Podcast não encontrado");
            }

            return podcast.get();
        } catch (Exception ex) {
            throw new InternalServerError(ex);
        }
    }

    @Override
    public Page<Podcast> findAll(Pageable pageable) {
        try {
            Page<Podcast> page = repository.findAll(pageable);

            if (page.isEmpty()) {
                throw new NotFoundException("Nenhum podcast encontrado");
            }

            return page;
        } catch (Exception ex) {
            throw new InternalServerError(ex);
        }
    }
}
