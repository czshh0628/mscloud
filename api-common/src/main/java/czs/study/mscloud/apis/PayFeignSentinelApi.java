package czs.study.mscloud.apis;

import czs.study.mscloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author czs
 */
@FeignClient(value = "nacos-payment-provider", fallback = PayFeignSentinelApiFallBack.class)
public interface PayFeignSentinelApi {
    @GetMapping(value = "/pay/nacos/get/{orderNo}")
    public ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo);
}
