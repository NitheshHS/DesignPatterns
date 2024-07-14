package org.abstract_factory.abstractfactory;

import org.abstract_factory.EC2Instance;
import org.abstract_factory.Instances;
import org.abstract_factory.S3Storage;
import org.abstract_factory.Storage;

public class EC2InstanceFactory implements InstanceFactory{
    @Override
    public Instances createInstance(Instances instances) {
        return new EC2Instance();
    }

    @Override
    public Storage createStorage(Storage storage) {
        return new S3Storage();
    }
}
