package com.ksc.redis.transform.cache;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: AnalyzeHotKeysUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class AnalyzeHotKeysUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {

    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), null);
    }
}