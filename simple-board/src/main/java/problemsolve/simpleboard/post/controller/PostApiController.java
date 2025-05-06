package problemsolve.simpleboard.post.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import problemsolve.simpleboard.common.Api;
import problemsolve.simpleboard.post.db.PostEntity;
import problemsolve.simpleboard.post.model.PostRequest;
import problemsolve.simpleboard.post.model.PostViewRequest;
import problemsolve.simpleboard.post.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostApiController {
    private final PostService postService;

    @PostMapping("")
    public PostEntity create(
        @Valid
        @RequestBody PostRequest postRequest
    ){
        return postService.create(postRequest);
    }

    @PostMapping("/view")
    public PostEntity view(
            @Valid
            @RequestBody PostViewRequest postViewRequest
            ){
        return postService.view(postViewRequest);
    }

    @GetMapping("/all")
    public Api<List<PostEntity>> list(
        @PageableDefault(page=0, size=10, sort = "id", direction = Sort.Direction.DESC)
        Pageable pageable
    ){
        return postService.all(pageable);
    }

    @PostMapping("/delete")
    public void delete(
            @Valid
            @RequestBody PostViewRequest postViewRequest
    ){
        postService.delete(postViewRequest);
    }

}
