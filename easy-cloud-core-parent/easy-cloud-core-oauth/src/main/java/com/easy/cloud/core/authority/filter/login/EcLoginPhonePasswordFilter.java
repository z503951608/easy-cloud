package com.easy.cloud.core.authority.filter.login;

import org.crazycake.shiro.AuthCachePrincipal;

/**
 * @author daiqi
 * @create 2018-06-27 9:04
 */
public class EcLoginPhonePasswordFilter extends EcBaseLoginFilter {

    @Override
    protected AuthCachePrincipal getAuthCachePrincipal(String loginName) {
        return getSysUserService().findByPhone(loginName);
    }
}
