package experion.com.retrofitdemo.API;

import experion.com.retrofitdemo.model.gitmodel;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Vipin Raj on 9/2/2015.
 */
public interface gitapi {
    @GET("/users/{user}")
    public void getFeed(@Path("user") String user, Callback<gitmodel> response);
}
