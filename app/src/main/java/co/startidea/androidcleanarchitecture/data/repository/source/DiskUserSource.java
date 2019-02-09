package co.startidea.androidcleanarchitecture.data.repository.source;

import java.util.List;

import co.startidea.androidcleanarchitecture.UserModel;
import co.startidea.androidcleanarchitecture.data.repository.UserRepository;
import io.reactivex.Observable;

public class DiskUserSource implements UserRepository {

    @Override
    public Observable<List<UserModel>> getUsers() {
        return null;
    }

    @Override
    public Observable<UserModel> getUser(int userId) {
        return null;
    }
}
