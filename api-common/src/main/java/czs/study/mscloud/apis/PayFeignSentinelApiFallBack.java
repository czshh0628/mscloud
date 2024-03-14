package czs.study.mscloud.apis;

import czs.study.mscloud.resp.ResultData;
import czs.study.mscloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * @author czs
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi {
    @Override
    public ResultData getPayByOrderNo(String orderNo) {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(), "对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
