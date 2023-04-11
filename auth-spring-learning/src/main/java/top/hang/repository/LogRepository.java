package top.hang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.hang.entity.Log;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 16:19
 */
public interface LogRepository extends JpaRepository<Log, Integer> {
}
