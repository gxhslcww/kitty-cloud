package com.cxytiandi.kittycloud.article.provider.convert;

import com.cxytiandi.kittycloud.article.api.response.ArticleResponse;
import com.cxytiandi.kittycloud.article.biz.bo.ArticleBO;
import com.cxytiandi.kittycloud.common.base.EntityConvert;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ArticleResponseConvert implements EntityConvert<ArticleBO, ArticleResponse> {

    @Override
    public ArticleResponse convert(ArticleBO source) {
        ArticleResponse target = new ArticleResponse();
        BeanUtils.copyProperties(source, target);
        target.setTags(Arrays.asList(source.getTags().split(",")));
        return target;
    }

}