package com.test.zhangtao.activitytest;

import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by zhangtao on 16/12/5.
 */

public class GenericTest
{
    private Map<String , Integer> score;

    public static void showGeneric() throws Exception
    {
        Class<GenericTest> clazz = GenericTest.class;
        Field f = clazz.getDeclaredField("score");
        //直接使用getType()取出类型只对普通类型的成员变量有效
        Class<?> a = f.getType();
        //下面将看到仅输出java.util.Map
        Log.d("GenericTest" , "score的类型是：" + a);
        //获取成员变量f的泛型类型
        Type gType = f.getGenericType();
        //如果gType类型是ParameterizedType对象
        if (gType instanceof ParameterizedType)
        {
            //强制类型转换
            ParameterizedType pType = (ParameterizedType) gType;
            //获取原始类型
            Type rType = pType.getRawType();
            Log.d("GenericTest" , "原始类型是：" + rType);
            Type[] tArgs = pType.getActualTypeArguments();
            Log.d("GenericTest" , "泛型消息是：");
            for (int i = 0 ; i < tArgs.length ; i++)
            {
                Log.d("GenericTest" , "第" + i + "泛型类型是：" + tArgs[i]);
            }
        }
    }

}
