/**
 * Created by Eakon on 2017/7/14.
 */
public interface _620_NotBoringMovies {
    String sqlQueryStatement="SELECT * FROM cinema WHERE mod(id,2)=1 AND description <> 'boring' ORDER BY rating DESC";
}
