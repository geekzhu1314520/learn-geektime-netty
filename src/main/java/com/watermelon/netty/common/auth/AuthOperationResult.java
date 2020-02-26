package com.watermelon.netty.common.auth;

import com.watermelon.netty.common.OperationResult;
import lombok.Data;

@Data
public class AuthOperationResult extends OperationResult {

    private final boolean passAuth;

}
