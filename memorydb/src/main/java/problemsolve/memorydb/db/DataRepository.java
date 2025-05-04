package problemsolve.memorydb.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository <T,ID> extends  Repository<T,ID> {

    // create, update : 기존에 데이터가 있으면 업데이트, 없으면 새로 만들 거임
    T save(T data);

    // read
    Optional<T> findById(ID id); // Optional : NPE(Null Point Exception) 방지, null 가능

    List<T> findAll();

    // delete
    void delete(ID id);
}

