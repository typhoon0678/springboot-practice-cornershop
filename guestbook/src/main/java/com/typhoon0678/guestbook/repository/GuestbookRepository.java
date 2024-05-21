package com.typhoon0678.guestbook.repository;

import com.typhoon0678.guestbook.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long> {
}
