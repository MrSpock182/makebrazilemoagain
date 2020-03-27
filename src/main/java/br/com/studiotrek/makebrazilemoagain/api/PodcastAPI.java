package br.com.studiotrek.makebrazilemoagain.api;

import br.com.studiotrek.makebrazilemoagain.domain.Podcast;
import br.com.studiotrek.makebrazilemoagain.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PodcastAPI {

    @Autowired
    private PodcastService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/find-podcast/{id}")
    public Podcast findPodcast(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/find-all-podcast")
    public Page<Podcast> findAllPodcast(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                        @RequestParam(name = "size", defaultValue = "10") Integer size) {
        return service.findAll(page, size);
    }

}
