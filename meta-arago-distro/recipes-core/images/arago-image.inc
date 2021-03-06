# Common pieces for Arago images

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

# 4KB per 1 inode should be enough
EXTRA_IMAGECMD_ext2.gz += "-i 4096"

VIRTUAL-RUNTIME_dev_manager = "udev"
VIRTUAL-RUNTIME_init_manager = "sysvinit"
VIRTUAL-RUNTIME_initscripts = "initscripts"
VIRTUAL-RUNTIME_login_manager = "tinylogin shadow"

ARAGO_IMAGE_EXTRA_INSTALL ?= ""

IMAGE_INSTALL += " \
	packagegroup-core-boot \
	bash \
	${ROOTFS_PKGMANAGE} \
	${ARAGO_IMAGE_EXTRA_INSTALL} \
"

export IMAGE_BASENAME = "arago-image"

IMAGE_LINGUAS = ""

inherit core-image
