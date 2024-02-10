package org.example.test.controller;

import org.example.test.domain.Category;
import org.example.test.domain.TestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String homecontroller(Model model){
        List<TestDto> categories = List.of(
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리1",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                ),
                new TestDto(
                        "대 카테고리2",
                        List.of(
                                new Category("중 카테고리1"
                                ),
                                new Category("중 카테고리2"
                                ),
                                new Category("중 카테고리3"
                                )
                        )
                )
        );
        model.addAttribute("categories",categories);
        return "test";
    }
}
