package czs.study.mscloud.service;

/**
 * @author czs
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
