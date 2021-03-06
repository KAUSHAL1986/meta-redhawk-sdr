DESCRIPTION = "shared library for GIF images"
SECTION = "libs"
LICENSE = "MIT"
PR = "r2"

SRC_URI = "${SOURCEFORGE_MIRROR}/giflib/${BP}.tar.bz2"
LIC_FILES_CHKSUM = "file://COPYING;md5=ae11c61b04b2917be39b11f78d71519a"

inherit autotools

DEPENDS = "libsm"

PACKAGES += "${PN}-utils"
FILES_${PN} = "${libdir}/libgif.so.*"
FILES_${PN}-utils = "${bindir}"

BBCLASSEXTEND = "native"

SRC_URI[md5sum] = "7125644155ae6ad33dbc9fc15a14735f"
SRC_URI[sha256sum] = "e1c1ced9c5bc8f93ef0faf0a8c7717abf784d10a7b270d2285e8e1f3b93f2bed"
