package com.myorg;

import software.amazon.awscdk.App;

public final class RuntimeLambdaWithBucketApp {
    public static void main(final String[] args) {
        App app = new App();

        new RuntimeLambdaWithBucketStack(app, "RuntimeLambdaWithBucketStack");

        app.synth();
    }
}
