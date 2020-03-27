package br.com.studiotrek.makebrazilemoagain.repository;

import br.com.studiotrek.makebrazilemoagain.domain.Podcast;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseRepository {
    Podcast findById(String id);
    Page<Podcast> findAll(Pageable pageable);
}
