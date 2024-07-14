package org.abstract_factory;

import org.abstract_factory.abstractfactory.EC2InstanceFactory;
import org.abstract_factory.abstractfactory.InstanceFactory;

public class Main {
    public static void main(String[] args) {
        InstanceFactory ec2Instance = createInstanceAndStorage(new EC2InstanceFactory());
        ec2Instance.createInstance(new EC2Instance());
        ec2Instance.createStorage(new S3Storage());


    }

    public static InstanceFactory createInstanceAndStorage(InstanceFactory instanceFactory){
        return instanceFactory;
    }
}
