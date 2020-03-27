package br.com.studiotrek.makebrazilemoagain.service;

import br.com.studiotrek.makebrazilemoagain.domain.Podcast;
import org.springframework.data.domain.Page;

public interface PodcastService {
    Podcast findById(String id);
    Page<Podcast> findAll(Integer page, Integer size);
}
