package czs.study.mscloud.entities;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * @author czs
 */
@Data
@Table(name = "t_account")
@ToString
public class Account implements Serializable {
    /**
     * id
     * -- GETTER --
     * 获取id
     *
     * @return id - id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户id
     * -- GETTER --
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 总额度
     * -- GETTER --
     * 获取总额度
     *
     * @return total - 总额度
     */
    private Long total;

    /**
     * 已用余额
     * -- GETTER --
     * 获取已用余额
     *
     * @return used - 已用余额
     */
    private Long used;

    /**
     * 剩余可用额度
     * -- GETTER --
     * 获取剩余可用额度
     *
     * @return residue - 剩余可用额度
     */
    private Long residue;
}

