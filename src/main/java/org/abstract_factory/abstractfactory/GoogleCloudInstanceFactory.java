package org.abstract_factory.abstractfactory;

import org.abstract_factory.GoogleCloudInstance;
import org.abstract_factory.GoogleCloudStorage;
import org.abstract_factory.Instances;
import org.abstract_factory.Storage;

public class GoogleCloudInstanceFactory implements InstanceFactory{
    @Override
    public Instances createInstance(Instances instances) {
        return new GoogleCloudInstance();
    }

    @Override
    public Storage createStorage(Storage storage) {
        return new GoogleCloudStorage();
    }
}
