package bootDemo;

import org.springframework.stereotype.Service;


@Service
public class TestInterFaceImpl implements TestInterFace {
    @Override public int testInterFace() {
        return 0;
    }

    @Override public User testUser(String username,String password) {
        return new User(username,password);
    }


}
