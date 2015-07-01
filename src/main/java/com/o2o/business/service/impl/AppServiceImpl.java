package com.o2o.business.service.impl;

import com.o2o.business.service.AppService;
import com.o2o.dao.AppDao;
import com.o2o.dao.pojo.App;
import com.o2o.model.param.AppBo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User:bowen.ma
 * Date:14/10/27
 *
 * @Description To change this template use File | Settings | File Templates.
 */
public class AppServiceImpl implements AppService {

    @Autowired
    private AppDao appDao;

    @Override
    public boolean registerApp(AppBo appBo) {
        App app = new App();
        app.setAppname("测试工程");
        appDao.insert(app);
        return false;
    }
}
