package problemsolve.memorydb.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import problemsolve.memorydb.user.db.UserRepository;
import problemsolve.memorydb.user.model.UserEntity;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity save(UserEntity user){
        return userRepository.save(user);
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void delete(UserEntity id) {
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public List<UserEntity> filterScore(int score){
//        return null;
        return userRepository.findAllByScoreGreaterThanEqual(score);
    }

    public List<UserEntity> filterScore(int min, int max){
//        return null;
//        return userRepository.findAllByScoreGreaterThanEqualAndScoreLessThanEqual(min,max);
        return userRepository.score(min,max);
    }
}
