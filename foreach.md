

### List < Integer >

```java
int batchDeleteSubPark(List<Integer> idList);

<delete id="batchDeleteSubPark" parameterType="list">
    delete from sub_park_car_in where id in
    <foreach item="item" collection="list" open="(" separator="," close=")">
        #{item}
    </foreach>
</delete>
```

