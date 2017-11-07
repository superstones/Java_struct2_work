package DB;

import Bean.Path;
import Dao.PathDB;

import java.util.List;

/**
 * Created by idea on 2017/11/5.
 */
public class PathDao {
    public List<Path> paths(){
        return PathDB.pathList;
    }

    public void add(Path path){
        PathDB.pathList.add(path);
    }
}
