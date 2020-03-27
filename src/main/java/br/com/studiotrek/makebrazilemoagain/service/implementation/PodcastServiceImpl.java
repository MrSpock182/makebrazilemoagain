package br.com.studiotrek.makebrazilemoagain.service.implementation;

import br.com.studiotrek.makebrazilemoagain.domain.Podcast;
import br.com.studiotrek.makebrazilemoagain.repository.BaseRepository;
import br.com.studiotrek.makebrazilemoagain.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PodcastServiceImpl implements PodcastService {

    @Autowired
    private BaseRepository repository;

    @Override
    public Podcast findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Page<Podcast> findAll(Integer page, Integer size) {
        return repository.findAll(PageRequest.of(page, size));
    }
}
