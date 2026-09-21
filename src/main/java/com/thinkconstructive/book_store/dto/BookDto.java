package com.thinkconstructive.book_store.dto;

public record BookDto(String bookId, String name,
                      double price, String author, String description) {
}
