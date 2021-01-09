package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.entity.BookData;

@Repository
public interface BookDataRepository extends JpaRepository<BookData, Long> { //JpaRepository: インターフェイス。＜エンティティ、 IDタイプ＞　メソッドを呼び出すだけでスマートにデータ検索が行えるようになる。
	
}
