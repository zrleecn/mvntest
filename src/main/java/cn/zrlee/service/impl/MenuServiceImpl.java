package cn.zrlee.service.impl;

import cn.zrlee.mapper.MenuMapper;
import cn.zrlee.pojo.Menu;
import cn.zrlee.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper ;

    @Override
    public List<Menu> show() {
        return menuMapper.selAll();
    }
}
