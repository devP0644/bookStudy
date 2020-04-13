package kr.co.bookStudy.web;

import kr.co.bookStudy.web.domain.posts.Posts;
import kr.co.bookStudy.web.dto.PostsResponseDto;
import kr.co.bookStudy.web.dto.PostsSaveRequestDto;
import kr.co.bookStudy.web.dto.PostsUpdateRequestDto;
import kr.co.bookStudy.web.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id,
                       @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

}
