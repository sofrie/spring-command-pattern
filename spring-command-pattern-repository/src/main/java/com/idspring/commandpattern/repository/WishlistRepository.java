package com.idspring.commandpattern.repository;

import com.idspring.commandpattern.entity.Cart;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface WishlistRepository extends ReactiveMongoRepository<Wishlist, String> {
    List<Wishlist> findByUsername(String username);
}
