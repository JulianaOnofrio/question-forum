package br.com.juliana.questionforum.repository;

import br.com.juliana.questionforum.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Long> {
}
