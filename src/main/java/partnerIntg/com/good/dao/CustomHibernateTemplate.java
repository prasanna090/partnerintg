package partnerIntg.com.good.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 8:01 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CustomHibernateTemplate  extends HibernateDaoSupport {
        @Autowired
        public void anyMethodName(SessionFactory sessionFactory)
        {
            setSessionFactory(sessionFactory);
        }
}
