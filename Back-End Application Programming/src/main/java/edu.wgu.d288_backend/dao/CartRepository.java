package dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<entity.Cart, Long> {
}
