#include "pch.h"
#include "crayon_jni_JNITest.h"

long tmp = 0;
JNIEXPORT void JNICALL Java_crayon_jni_JNITest_set
(JNIEnv*, jclass, jint value) {
	tmp = value;
}
JNIEXPORT jint JNICALL Java_crayon_jni_JNITest_get
(JNIEnv*, jclass) {
	return tmp;
}
