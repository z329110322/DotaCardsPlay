import com.zhaoqi.common.model.hero.*;
import com.zhaoqi.common.model.skill.HeroSkill;
import com.zhaoqi.exercises.services.PutSkills;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhaoqi on 2016/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(locations={"file:web/resources/META-INF/spring/spring*.xml"})
public class MainTest {

    @Resource
    private PutSkills putSkills;

    @Test
    public void test() {
        putSkills.putSkills(new DotaHero(),new HeroSkill(), new DotaHero());
    }

}
