package czs.study.mscloud.mapper;

import czs.study.mscloud.entities.Account;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;


/**
 * @author czs
 */
public interface AccountMapper extends Mapper<Account> {

    /**
     * @param userId
     * @param money  本次消费金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}

