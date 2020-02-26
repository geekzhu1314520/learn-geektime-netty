package com.watermelon.netty.common.keepalive;

import com.watermelon.netty.common.OperationResult;
import lombok.Data;

@Data
public class KeepaliveOperationResult extends OperationResult {

    private final long time;

}
