package com.yermoon.hunt4j.core.http;

/**
 * To change this template use File | Settings | File Templates.
 *
 * @author wangqing
 * @since 1.0.0
 */
public interface Hunter {
    /**
     * 获取网页内容
     *
     * @param url 访问地址如：http://www.yermoon.com/
     * @return 页面内容字符串
     * @throws Exception
     */
    public String getHtml(String url) throws Exception;

    /**
     * 获取网页内容
     *
     * @param url     访问地址如：http://www.yermoon.com/
     * @param charsetName 编码格式
     * @param timeout 超时时间
     * @return 页面内容字符串
     * @throws Exception
     */
    public String getHtml(String url,String charsetName,  int timeout) throws Exception;

}
