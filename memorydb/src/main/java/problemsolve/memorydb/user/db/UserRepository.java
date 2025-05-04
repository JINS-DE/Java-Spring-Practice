package problemsolve.memorydb.user.db;

import org.springframework.stereotype.Service;
import problemsolve.memorydb.db.SimpleDataRepository;
import problemsolve.memorydb.user.model.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRepository extends SimpleDataRepository<UserEntity, Long> {

    public List<UserEntity> findAllScoreGreaterTen(int score){
        return this.findAll().stream()
                .filter(
                        it->{
                            return it.getScore() >= score;
                        }
                ).collect(Collectors.toList());
    }
}
