package com.example.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * Created by mgx on 17/11/21.
 *
 * 如果继承jpaRepository类,可以使用以下的方法来直接映射,不用写SQL语句了
 */
public interface UserRepository extends JpaRepository<User, Long> {

//    And --- 等价于 SQL 中的 and 关键字，比如 findByUsernameAndPassword(String user, Striang pwd)；
//    Or --- 等价于 SQL 中的 or 关键字，比如 findByUsernameOrAddress(String user, String addr)；
//    Between --- 等价于 SQL 中的 between 关键字，比如 findBySalaryBetween(int max, int min)；
//    LessThan --- 等价于 SQL 中的 "<"，比如 findBySalaryLessThan(int max)；
//    GreaterThan --- 等价于 SQL 中的">"，比如 findBySalaryGreaterThan(int min)；
//    IsNull --- 等价于 SQL 中的 "is null"，比如 findByUsernameIsNull()；
//    IsNotNull --- 等价于 SQL 中的 "is not null"，比如 findByUsernameIsNotNull()；
//    NotNull --- 与 IsNotNull 等价；
//    Like --- 等价于 SQL 中的 "like"，比如 findByUsernameLike(String user)；
//    NotLike --- 等价于 SQL 中的 "not like"，比如 findByUsernameNotLike(String user)；
//    OrderBy --- 等价于 SQL 中的 "order by"，比如 findByUsernameOrderBySalaryAsc(String user)；
//    Not --- 等价于 SQL 中的 "！ ="，比如 findByUsernameNot(String user)；
//    In --- 等价于 SQL 中的 "in"，比如 findByUsernameIn(Collection<String> userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；
//    NotIn --- 等价于 SQL 中的 "not in"，比如 findByUsernameNotIn(Collection<String> userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；

    User findByUserName(String username);

    User findByUserNameOrPassword(String username,String password);

    //使用Query可以编写自定义的sql
    //@Modifying(clearAutomatically=true)的作用为,清除缓存,jpa默认为2级缓存,如果需要实时更新数据的,则需清除缓存
    //Transactional 事务
//    @Modifying(clearAutomatically=true)
//    @Transactional
//    @Query("update User set outDate=:outDate, validataCode=:validataCode where email=:email")
//    int setOutDateAndValidataCode(@Param("outDate") String outDate, @Param("validataCode") String validataCode, @Param("email") String email);

}
