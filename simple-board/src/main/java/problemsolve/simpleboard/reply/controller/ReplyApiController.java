package problemsolve.simpleboard.reply.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import problemsolve.simpleboard.reply.db.ReplyEntity;
import problemsolve.simpleboard.reply.model.ReplyRequest;
import problemsolve.simpleboard.reply.service.ReplyService;

@RestController
@RequestMapping("/api/reply")
@RequiredArgsConstructor
public class ReplyApiController {
    private final ReplyService replyService;

    @PostMapping("")
    public ReplyEntity create(
            @Valid
            @RequestBody ReplyRequest replyRequest
            ){
        return replyService.create(replyRequest);
    }
}
