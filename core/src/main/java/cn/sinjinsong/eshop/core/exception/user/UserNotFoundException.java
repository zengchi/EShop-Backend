package cn.sinjinsong.eshop.core.exception.user;

import cn.sinjinsong.eshop.common.exception.annotation.RestField;
import cn.sinjinsong.eshop.common.exception.annotation.RestResponseStatus;
import cn.sinjinsong.eshop.common.exception.base.BaseRestException;
import org.springframework.http.HttpStatus;

/**
 * Created by SinjinSong on 2017/5/6.
 */
@RestResponseStatus(value = HttpStatus.NOT_FOUND,code=8)
@RestField("queryKey")
public class UserNotFoundException extends BaseRestException {
    public UserNotFoundException(String key){
        super(key);
    }
}
