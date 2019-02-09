package co.startidea.androidcleanarchitecture.data.repository;

import java.util.List;

import co.startidea.androidcleanarchitecture.UserModel;
import co.startidea.androidcleanarchitecture.data.repository.source.DiskUserSource;
import co.startidea.androidcleanarchitecture.data.repository.source.MemoryUserSource;
import co.startidea.androidcleanarchitecture.data.repository.source.NetworkUserSource;
import io.reactivex.Observable;

public class UserDataRepository implements UserRepository {
    private MemoryUserSource memoryUserSource;
    private DiskUserSource diskUserSource;
    private NetworkUserSource networkUserSource;

    @Override
    public Observable<UserModel> getUser(int userId) {
        UserRepository dataRepository = null;
        /* return memory source if available */
        /* if memory source is null check disk source and check isExpired  */
        /* if disk source is null return network and save to memory and disk */
        if (memoryUserSource.getUser(userId) == null) {
            dataRepository = memoryUserSource;
        }
        return dataRepository.getUser(userId);
    }


    @Override
    public Observable<List<UserModel>> getUsers() {

        return null;
    }
}
