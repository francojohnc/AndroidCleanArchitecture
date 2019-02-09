
package co.startidea.androidcleanarchitecture.data.repository;


import java.util.List;

import co.startidea.androidcleanarchitecture.UserModel;
import io.reactivex.Observable;

public interface UserRepository {
    Observable<UserModel> getUser(final int userId);
    Observable<List<UserModel>> getUsers();
}
