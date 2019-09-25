package xyz.dsvshx.blog.utils;

public class ResultUtil {

    public static Result success(String msg) {
        return success(null, msg);
    }
    public static Result success(int code) {
        return success(code,null, null);
    }

    public static Result success(Object object, String msg) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setData(object);
        return result;
    }

    public static Result success(Integer code, Object object, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
