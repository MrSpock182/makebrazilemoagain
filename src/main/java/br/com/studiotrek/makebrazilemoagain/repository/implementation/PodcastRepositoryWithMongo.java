package br.com.studiotrek.makebrazilemoagain.repository.implementation;

import br.com.studiotrek.makebrazilemoagain.domain.Podcast;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PodcastRepositoryWithMongo extends PagingAndSortingRepository<Podcast, String> {
}
