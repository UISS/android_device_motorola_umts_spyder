# inherit from common
-include device/motorola/omap4-kexec-common/BoardConfigCommon.mk

# inherit from the proprietary version
-include vendor/motorola/umts_spyder/BoardConfigVendor.mk

# Processor
TARGET_BOOTLOADER_BOARD_NAME := umts_spyder

# Kernel
BOARD_KERNEL_CMDLINE := root=/dev/ram0 rw mem=1023M@0x80000000 console=null vram=10300K omapfb.vram=0:8256K,1:4K,2:2040K init=/init ip=off mmcparts=mmcblk1:p7(pds),p8(utags),p14(boot),p15(recovery),p16(cdrom),p17(misc),p18(cid),p19(kpanic),p20(system),p21(cache),p22(preinstall),p23(webtop),p24(userdata),p25(emstorage) mot_sst=1 androidboot.bootloader=0x0A74
BOARD_KERNEL_BASE := 0x80000000
BOARD_PAGE_SIZE := 0x4096

# Kernel Build
TARGET_KERNEL_SOURCE := kernel/motorola/omap4-kexec-common
TARGET_KERNEL_CONFIG := mapphone_1GB_defconfig

